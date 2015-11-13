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

public class QaTestCaseFlowMapConfigurator extends AdministrationConfiguration<QaTestCaseFlowMap>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("mappingDesc")
                .singularName("TestCase-Flow Map")
                .pluralName("TestCase-Flow Map").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("TestCase to Flow Map Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testCaseFlowMapId").caption("TestCase Flow Map Id")
        		.dynamic("qaTestCase.testCaseName").caption("Test Case")
        		.dynamic("qaFlow.flowDesc").caption("Flow")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("depFlow").caption("Dependent Flow")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testCaseFlowMapId").caption("TestCase Flow Map Id")
        		.field("qaTestCase").caption("Test Case Id")
        		.field("qaFlow").caption("Flow Id")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("depFlow").caption("Dependent Flow")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testCaseFlowMapId").caption("TestCase Flow Map Id")
        		.field("qaTestCase").caption("Test Case Id")
        		.field("qaFlow").caption("Flow Id")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("depFlow").caption("Dependent Flow")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("testCaseFlowMapId").caption("TestCase Flow Map Id")
        		.field("qaTestCase").caption("Test Case Id")
        		.field("qaFlow").caption("Flow Id")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("depFlow").caption("Dependent Flow")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Test Case Id","qaTestCase")
        		.filter("Flow Id","qaFlow")
        		.filter("Execution Sequence","execSequence")
        		.filter("Dependent Flow","depFlow")
        		.build();
    }
}
