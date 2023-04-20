package com.jds.neo4j.reactive.graphs.repositories;

import com.jds.neo4j.reactive.graphs.model.ETFNode;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ETFRepository extends ReactiveNeo4jRepository<ETFNode, String> {
}
