package com.jpmc.stockmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpmc.stockmarket.models.Trade;

import java.util.Date;
import java.util.List;

/**
 * A crud repository to access Trades.
 * @see com.jpmc.stockmarket.models.Trade
 */
@Repository
public interface TradeRepository extends CrudRepository<Trade, Long>{
  List<Trade> findByStockSymbolAndTimeStampAfter(String stockSymbol, Date timestamp);

  List<Trade> findByStockSymbol(String stockSymbol);
}
