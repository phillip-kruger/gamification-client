package com.github.phillipkruger.gamification;

import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLClientApi
public interface PersonGraphQLClient {
    
    @Query
    public Person getPerson(Long id);
    
}
