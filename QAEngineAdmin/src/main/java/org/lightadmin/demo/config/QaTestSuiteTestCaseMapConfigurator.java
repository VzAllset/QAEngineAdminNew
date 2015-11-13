package org.lightadmin.demo.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FiltersConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;
import org.lightadmin.demo.model.QaFlowStepMap;
import org.lightadmin.demo.model.QaTestCaseFlowMap;
import org.lightadmin.demo.model.QaTestSuiteTestCaseMap;

public class QaTestSuiteTestCaseMapConfigurator extends AdministrationConfiguration<QaTestSuiteTestCaseMap>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("description")
                .singularName("TestSuite-TestCase Map")
                .pluralName("TestSuite-TestCase Map").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("TestSuite to TestCase Map Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testSuiteTestCaseMapId").caption("Id")
        		.dynamic("qaTestSuiteByTestSuiteId.testSuiteName").caption("Test Suite")
        		.dynamic("qaTestCase.testCaseName").caption("Test Case")
        		//.dynamic("qaTestSuiteByDepSuite.testSuiteName").caption("Dependent Test Suite")
        		.field("description").caption("Description")
        		.field("execSequence").caption("Execution Sequence")
        		.build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testSuiteTestCaseMapId").caption("Id")
        		.field("qaTestSuiteByTestSuiteId").caption("Test Suite")
        		.field("qaTestCase").caption("Test Case Id")
        		//.field("qaTestSuiteByDepSuite").caption("Dependent Test Suite")
        		.field("description").caption("Description")
        		.field("execSequence").caption("Execution Sequence")
        		.build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testSuiteTestCaseMapId").caption("Id")
        		.field("qaTestSuiteByTestSuiteId").caption("Test Suite")
        		.field("qaTestCase").caption("Test Case Id")
        		//.field("qaTestSuiteByDepSuite").caption("Dependent Test Suite")
        		.field("description").caption("Description")
        		.field("execSequence").caption("Execution Sequence")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testSuiteTestCaseMapId").caption("Id")
        		.field("qaTestSuiteByTestSuiteId").caption("Test Suite")
        		.field("qaTestCase").caption("Test Case Id")
        		//.field("qaTestSuiteByDepSuite").caption("Dependent Test Suite")
        		.field("description").caption("Description")
        		.field("execSequence").caption("Execution Sequence")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Test Suite Id","qaTestSuiteByTestSuiteId")
        		.filter("Description","description")
        		.filter("Execution Sequence","execSequence")
        		.build();
    }
}
