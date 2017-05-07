package com.jpmc.stockmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpmc.stockmarket.models.Stock;

/**
 * A crud repository to access Stocks.
 * @see com.jpmc.stockmarket.models.Stock
 */
@Repository
public interface StockRepository extends CrudRepository<Stock, String> {
  Stock findBySymbol(String stockSymbol);
}
