package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExampleEntity extends PanacheEntityBase {
    @Id
    Long companyId;
}

