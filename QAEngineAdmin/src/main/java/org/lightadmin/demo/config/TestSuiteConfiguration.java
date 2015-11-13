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
import org.lightadmin.demo.model.Application;
import org.lightadmin.demo.model.QaTestSuite;

public class TestSuiteConfiguration extends AdministrationConfiguration<QaTestSuite>
{
	 public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
	        return configurationBuilder
	                .nameField("testSuiteName")
	                .singularName("Test Suite")
	                .pluralName("Test Suites").build();
	    }

	    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
	        return screenContextBuilder.screenName("Test Suite Administration").build();
	    }

	    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	                .field("testSuiteId").caption("Test Suite Id")
	                .field("testSuiteName").caption("Test Suite Name")
	                .dynamic("application.applicationName").caption("Application")
	                .field("newBrowser").caption("New Browser").build();
	    }

	    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testSuiteId").caption("Test Suite Id")
	                .field("testSuiteName").caption("Test Suite Name")
	                .field("application").caption("Application Id")
	                .field("newBrowser").build();
	    }

	    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testSuiteId").caption("Test Suite Id")
	                .field("testSuiteName").caption("Test Suite Name")
	                .field("application").caption("Application Id")
	                .field("newBrowser").build();
	    }

	    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testSuiteId").caption("Test Suite Id")
	                .field("testSuiteName").caption("Test Suite Name")
	                .field("application").caption("Application Id")
	                .field("newBrowser").build();
	    }

	    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
	        return filterBuilder
	                .filter("Test Suite Id", "testSuiteId")
	                .filter("Test Suite Name", "testSuiteName").build();
	    }
}
