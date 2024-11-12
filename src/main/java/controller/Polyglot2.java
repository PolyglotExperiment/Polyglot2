package controller;

import dao.ProductDAO;
import ef.qb.core.QueryBuilder;

public class Polyglot2 {

    private static ProductDAO productDAO;

    public Polyglot2() {
        productDAO = QueryBuilder.create(ProductDAO.class);
    }

    public int countRatingEqual5ByBrand(String brand) {
        /*
        * implement here
         */
        return 0;
    }

}
