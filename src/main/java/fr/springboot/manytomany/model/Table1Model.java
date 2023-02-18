package fr.springboot.manytomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Set;

import jakarta.persistence.Column;

@Entity
@Table(name = "table1")
public class Table1Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tbl1")
	private int id;

	@Column(name = "label_tbl1", length = 50)
	private String label;

	@Column(name = "level_tbl1")
	private Integer level;

	@ManyToMany
	@JoinTable(name = "table1_table2")/*, 
	        joinColumns = { @JoinColumn(name = "id_tbl1") }, 
	        inverseJoinColumns = { @JoinColumn(name = "id_tbl2") })*/
	private Set<Table2Model> table2Models;

	public Table1Model() {
	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Set<Table2Model> getTable2Models() {
		return table2Models;
	}

	public void setTable2Models(Set<Table2Model> table2Models) {
		this.table2Models = table2Models;
	}

}
