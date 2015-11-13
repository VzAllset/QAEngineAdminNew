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
import org.lightadmin.demo.model.QaTestCase;
import org.lightadmin.demo.model.QaTestSuite;

public class TestCaseConfiguration extends AdministrationConfiguration<QaTestCase>
{
	 public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
	        return configurationBuilder
	                .nameField("testCaseName")
	                .singularName("TestCase")
	                .pluralName("TestCases").build();
	    }

	    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
	        return screenContextBuilder.screenName("Test Case Administration").build();
	    }

	    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	                .field("testCaseId").caption("Id")
	                .field("testCaseName").caption("Name")
	                .field("testCaseDesc").caption("Description")
	                .field("createDate").caption("Created Date")
	                .field("createUserid").caption("Created User").build();
	    }

	    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testCaseId").caption("Id")
	                .field("testCaseName").caption("Name")
	                .field("testCaseDesc").caption("Description")
	                .field("createDate").caption("Created Date")
	                .field("createUserid").caption("Created User").build();
	    }

	    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testCaseId").caption("Id")
	                .field("testCaseName").caption("Name")
	                .field("testCaseDesc").caption("Description")
	                .field("createDate").caption("Created Date")
	                .field("createUserid").caption("Created User").build();
	    }

	    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("testCaseId").caption("Id")
	                .field("testCaseName").caption("Name")
	                .field("testCaseDesc").caption("Description")
	                .field("createDate").caption("Created Date")
	                .field("createUserid").caption("Created User").build();
	    }

	    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
	        return filterBuilder
	                .filter("Test Case Id", "testCaseId")
	                .filter("Description", "testCaseDesc")
	                .filter("Test Case Name", "testCaseName").build();
	    }
}
