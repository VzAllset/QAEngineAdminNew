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
import org.lightadmin.demo.model.QaTestResult;

public class QaTestResultConfigurator extends AdministrationConfiguration<QaTestResult>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("Qa Test Result")
                .pluralName("Qa Test Result").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Qa Test Result Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testResultId").caption("Test Result Id")
        		.dynamic("qaData.dataName").caption("Data")
        		.dynamic("qaObject.objName").caption("Object")
        		.field("testDescription").caption("Test Description")
        		.field("status").caption("Status")
        		.field("action").caption("Action")
        		.field("createdDt").caption("createdDt")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testResultId").caption("Test Result Id")
        		.field("qaData").caption("Data")
        		.field("qaObject").caption("Object")
        		.field("testDescription").caption("Test Description")
        		.field("status").caption("Status")
        		.field("action").caption("Action")
        		.field("createdDt").caption("createdDt")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testResultId").caption("Test Result Id")
        		.field("qaData").caption("Data")
        		.field("qaObject").caption("Object")
        		.field("testDescription").caption("Test Description")
        		.field("status").caption("Status")
        		.field("action").caption("Action")
        		.field("createdDt").caption("createdDt")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testResultId").caption("Test Result Id")
        		.field("qaData").caption("Data")
        		.field("qaObject").caption("Object")
        		.field("testDescription").caption("Test Description")
        		.field("status").caption("Status")
        		.field("action").caption("Action")
        		.field("createdDt").caption("createdDt")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		
        		.filter("Test Result Id","testResultId")
        		.filter("Data","qaData")
        		.filter("Object","qaObject")
        		.filter("Test Description","testDescription")
        		.filter("Status","status")
        		.filter("Action","action")
        		.build();
    }
}
