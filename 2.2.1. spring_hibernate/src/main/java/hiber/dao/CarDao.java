package hiber.dao;

import hiber.model.User;

public interface CarDao {
    User getUserByModelAndSeries(String model, int series);
}
