package com.dsstudio.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "StockKeyword")
public class StockKeyword {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Column(name = "KeywordMainId", nullable = false)
	private int keywordMainId;

	@NotNull
	@Column(name = "AgentId", nullable = false)
	private int agentId;

	@NotNull
	@Column(name = "Name", nullable = false)
	private String name;

	@NotNull
	@Column(name = "Link", nullable = false)
	private String link;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateCreated", nullable = false)
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateUpdated", nullable = false)
	private Date dateUpdated;

	@NotNull
	@Column(name = "TypeId", nullable = false)
	private int typeId;

	@NotNull
	@Column(name = "Status", nullable = false)
	private int status;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKeywordMainId() {
		return keywordMainId;
	}

	public void setKeywordMainId(int keywordMainId) {
		this.keywordMainId = keywordMainId;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	
}

