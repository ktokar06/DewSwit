package com.foodelivery.dewswit.rep;

import com.foodelivery.dewswit.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository  extends CrudRepository<Orders, Long> {
}
