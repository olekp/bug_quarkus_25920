package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "/example")
public interface ExampleResource extends PanacheEntityResource<ExampleEntity, Long> {
}
