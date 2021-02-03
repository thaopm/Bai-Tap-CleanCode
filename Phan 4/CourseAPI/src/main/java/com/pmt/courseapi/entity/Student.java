package com.pmt.courseapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Student extends User {

	private int year;

}
