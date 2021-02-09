package com.company;

import java.util.Random;

public class EmployeeStockPlan {
    private Random random;
    public int grantStock (Employee e) {
        random = new Random();
        return random.nextInt(4) * e.grantStock();
    }

}
