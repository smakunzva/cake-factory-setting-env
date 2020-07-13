package com.cakefactory.bakery.cakefactory.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PastriesEntity implements Serializable {
    @Id
    public Integer id;
    @Column
    public String name;
    @Column
    public Integer price;
}
