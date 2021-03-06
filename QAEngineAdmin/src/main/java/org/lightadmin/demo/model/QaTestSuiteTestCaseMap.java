package org.lightadmin.demo.model;
// Generated Nov 5, 2015 6:47:26 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * QaTestSuiteTestCaseMap generated by hbm2java
 */
@Entity
@Table(name = "qa_test_suite_test_case_map", catalog = "sakila")
public class QaTestSuiteTestCaseMap implements java.io.Serializable {

	private Long testSuiteTestCaseMapId;
	private QaTestSuite qaTestSuiteByTestSuiteId;
	private QaTestSuite qaTestSuiteByDepSuite;
	private QaTestCase qaTestCase;
	private String description;
	private Long execSequence;

	public QaTestSuiteTestCaseMap() {
	}

	public QaTestSuiteTestCaseMap(Long testSuiteTestCaseMapId, QaTestSuite qaTestSuiteByTestSuiteId,
			QaTestCase qaTestCase) {
		this.testSuiteTestCaseMapId = testSuiteTestCaseMapId;
		this.qaTestSuiteByTestSuiteId = qaTestSuiteByTestSuiteId;
		this.qaTestCase = qaTestCase;
	}

	public QaTestSuiteTestCaseMap(Long testSuiteTestCaseMapId, QaTestSuite qaTestSuiteByTestSuiteId,
			QaTestSuite qaTestSuiteByDepSuite, QaTestCase qaTestCase, String description, Long execSequence) {
		this.testSuiteTestCaseMapId = testSuiteTestCaseMapId;
		this.qaTestSuiteByTestSuiteId = qaTestSuiteByTestSuiteId;
		this.qaTestSuiteByDepSuite = qaTestSuiteByDepSuite;
		this.qaTestCase = qaTestCase;
		this.description = description;
		this.execSequence = execSequence;
	}

	@Id

	@Column(name = "TEST_SUITE_TEST_CASE_MAP_ID", unique = true, nullable = false, precision = 10, scale = 0)
	public Long getTestSuiteTestCaseMapId() {
		return this.testSuiteTestCaseMapId;
	}

	public void setTestSuiteTestCaseMapId(Long testSuiteTestCaseMapId) {
		this.testSuiteTestCaseMapId = testSuiteTestCaseMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_SUITE_ID", nullable = false)
	public QaTestSuite getQaTestSuiteByTestSuiteId() {
		return this.qaTestSuiteByTestSuiteId;
	}

	public void setQaTestSuiteByTestSuiteId(QaTestSuite qaTestSuiteByTestSuiteId) {
		this.qaTestSuiteByTestSuiteId = qaTestSuiteByTestSuiteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEP_SUITE")
	public QaTestSuite getQaTestSuiteByDepSuite() {
		return this.qaTestSuiteByDepSuite;
	}

	public void setQaTestSuiteByDepSuite(QaTestSuite qaTestSuiteByDepSuite) {
		this.qaTestSuiteByDepSuite = qaTestSuiteByDepSuite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_CASE_ID", nullable = false)
	public QaTestCase getQaTestCase() {
		return this.qaTestCase;
	}

	public void setQaTestCase(QaTestCase qaTestCase) {
		this.qaTestCase = qaTestCase;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "EXEC_SEQUENCE", precision = 10, scale = 0)
	public Long getExecSequence() {
		return this.execSequence;
	}

	public void setExecSequence(Long execSequence) {
		this.execSequence = execSequence;
	}

}
