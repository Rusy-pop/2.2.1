package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class CarDaoImp implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserByModelAndSeries(String model, int series) {
        Query query = sessionFactory.getCurrentSession().createQuery("select u from User u " +
                        "where u.car.model = :model and u.car.series = :series")
                .setParameter("model", model)
                .setParameter("series", series);
        return (User) query.getSingleResult();
    }
}
