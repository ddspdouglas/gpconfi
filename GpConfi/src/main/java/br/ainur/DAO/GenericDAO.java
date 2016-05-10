package br.ainur.DAO;

import br.ainur.util.EntitySingleton;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class GenericDAO<T, I extends Serializable> {

    private Class<T> classModel;

    protected EntityManager entityManager;

    protected GenericDAO() {

    }

    public GenericDAO(Class<T> classModel) {
        this();
        this.classModel = classModel;
        entityManager = EntitySingleton.getInstance();
    }

    public void salvar(T objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void atualizar(T objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

    }

    public void remover(T objeto) {
        entityManager.remove(objeto);
    }

    public T buscarId(I id) {
        return entityManager.find(classModel, id);
    }

    public List<T> buscarTodos() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(classModel);
        query.from(classModel);

        return entityManager.createQuery(query).getResultList();
    }

    public List<T> buscar() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(classModel);
        query.from(classModel);

        return entityManager.createQuery(query).getResultList();
    }

}
