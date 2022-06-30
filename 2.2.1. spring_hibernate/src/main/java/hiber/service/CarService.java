package hiber.service;

import hiber.model.User;

public interface CarService {
    User getUserByModelAndSeries(String model, int series);
}
