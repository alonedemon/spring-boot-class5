package com.dh.demo.repository;

import com.dh.demo.domain.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mfloresv on 6/10/2017.
 */
public interface SubscriptionRepository extends MongoRepository<Subscription,String>{
}
