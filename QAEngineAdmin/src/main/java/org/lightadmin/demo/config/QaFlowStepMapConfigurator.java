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

public class QaFlowStepMapConfigurator extends AdministrationConfiguration<QaFlowStepMap>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaFlowStepMap")
                .pluralName("QaFlowStepMap").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("QA Flow to Step Map Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowStepMapId").caption("Flow Step Map Id")
        		.dynamic("qaFlowByFlowId.flowDesc").caption("Flow")
        		.dynamic("qaFlowByRefFlowId").caption("Qa Reference Flow")
        		.dynamic("qaStepByRefStepId").caption("QA Reference Step")
        		.dynamic("qaStepByStepId.stepDesc").caption("QA Step")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("refKey").caption("Reference Key")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowStepMapId").caption("Flow Step Map Id")
        		.field("qaFlowByFlowId").caption("Flow Id")
        		.field("qaFlowByRefFlowId").caption("Qa Reference Flow")
        		.field("qaStepByRefStepId").caption("QA Reference Step")
        		.field("qaStepByStepId").caption("QA Step")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("refKey").caption("Reference Key")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowStepMapId").caption("Flow Step Map Id")
        		.field("qaFlowByFlowId").caption("Flow Id")
        		.field("qaFlowByRefFlowId").caption("Qa Reference Flow")
        		.field("qaStepByRefStepId").caption("QA Reference Step")
        		.field("qaStepByStepId").caption("QA Step")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("refKey").caption("Reference Key")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowStepMapId").caption("Flow Step Map Id")
        		.field("qaFlowByFlowId").caption("Flow Id")
        		.field("qaFlowByRefFlowId").caption("Qa Reference Flow")
        		.field("qaStepByRefStepId").caption("QA Reference Step")
        		.field("qaStepByStepId").caption("QA Step")
        		.field("mappingDesc").caption("Mapping Description")
        		.field("execSequence").caption("Execution Sequence")
        		.field("refKey").caption("Reference Key")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Flow Step Map Id","flowStepMapId")
        		.filter("Flow Id","qaFlowByFlowId")
        		.filter("Qa Reference Flow","qaFlowByRefFlowId")
        		.filter("QA Reference Step","qaStepByRefStepId")
        		.filter("QA Step","qaStepByStepId")
        		.filter("Mapping Description","mappingDesc")
        		.filter("Execution Sequence","execSequence")
        		.filter("Reference Key","refKey")
        		.build();
    }
}
