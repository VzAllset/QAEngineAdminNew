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
import org.lightadmin.demo.model.QaResultTestCase;

public class QaResultTestCaseConfigurator extends AdministrationConfiguration<QaResultTestCase>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("Result-TestCase Map")
                .pluralName("Result-TestCase Map").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Qa Result to Test Case Map Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("resultTestCaseId").caption("Result Id")
        		.dynamic("qaFlow.flowDesc").caption("Flow")
        		.dynamic("qaStep.stepName").caption("Step")
        		.dynamic("qaTestCase.testCaseName").caption("Test Case")
        		.field("threadId").caption("Thread Id")
        		.field("status").caption("Status")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("resultTestCaseId").caption("Result Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaStep").caption("Step")
        		.field("qaTestCase").caption("Test Case")
        		.field("threadId").caption("Thread Id")
        		.field("status").caption("Status")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("resultTestCaseId").caption("Result Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaStep").caption("Step")
        		.field("qaTestCase").caption("Test Case")
        		.field("threadId").caption("Thread Id")
        		.field("status").caption("Status")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("resultTestCaseId").caption("Result Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaStep").caption("Step")
        		.field("qaTestCase").caption("Test Case")
        		.field("threadId").caption("Thread Id")
        		.field("status").caption("Status")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Result Id","resultTestCaseId")
        		.filter("Flow","qaFlow")
        		.filter("Step","qaStep")
        		.filter("Test Case","qaTestCase")
        		.filter("Thread Id","threadId")
        		.filter("Status","status")
        		.build();
    }
}
