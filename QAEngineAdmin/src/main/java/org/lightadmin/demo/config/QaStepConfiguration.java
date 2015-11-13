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
import org.lightadmin.demo.model.QaStep;

public class QaStepConfiguration  extends AdministrationConfiguration<QaStep>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaStep")
                .pluralName("QaSteps").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Step Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("stepId").caption("Step Id")
                .field("qaData").caption("Data")
                .field("qaObject").caption("Object")
                .field("stepName").caption("Step Name")
                .field("action").caption("Action")
                .field("stepDesc").caption("Step Description")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("stepId").caption("Step Id")
                .field("qaData").caption("Data")
                .field("qaObject").caption("Object")
                .field("stepName").caption("Step Name")
                .field("action").caption("Action")
                .field("stepDesc").caption("Step Description").build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("stepId").caption("Step Id")
                .field("qaData").caption("Data")
                .field("qaObject").caption("Object")
                .field("stepName").caption("Step Name")
                .field("action").caption("Action")
                .field("stepDesc").caption("Step Description").build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("stepId").caption("Step Id")
                .field("qaData").caption("Data")
                .field("qaObject").caption("Object")
                .field("stepName").caption("Step Name")
                .field("action").caption("Action")
                .field("stepDesc").caption("Step Description").build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Step Id","stepId")
        		.filter("Data","qaData")
        		.filter("Object","qaObject")
        		.filter("Step Name","stepName")
        		.filter("Action","action")
        		.filter("Step Description","stepDesc")
        		.build();
    }
}
