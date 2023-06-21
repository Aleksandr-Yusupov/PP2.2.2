package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        carList.add(new Car("Toyota", 2015, 10000));
        carList.add(new Car("BMW", 2018, 8000));
        carList.add(new Car("Mercedes", 2020, 5000));
        carList.add(new Car("Audi", 2017, 12000));
        carList.add(new Car("Honda", 2019, 9000));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}