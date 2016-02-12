package com.rpicloud.repositories;

import com.rpicloud.models.Pie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by kaspernissen on 12/02/2016.
 */
public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}
