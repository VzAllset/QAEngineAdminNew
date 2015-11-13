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
import org.lightadmin.demo.model.QaFlowTestMap;

public class QaFlowTestMapConfigurator extends AdministrationConfiguration<QaFlowTestMap>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("Qa Flow Test Map")
                .pluralName("Qa Flow Test Map").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("QA Flow to Test Map Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowTestMapId").caption("Flow Test Map Id")
        		.dynamic("qaFlow.flowDesc").caption("Flow")
        		.dynamic("qaTestResult.testDescription").caption("Qa Test Result")
        		.field("mappingDescription").caption("Mapping Description")
        		.field("createDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowTestMapId").caption("Flow Test Map Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaTestResult").caption("Qa Test Result")
        		.field("mappingDescription").caption("Mapping Description")
        		.field("createDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowTestMapId").caption("Flow Test Map Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaTestResult").caption("Qa Test Result")
        		.field("mappingDescription").caption("Mapping Description")
        		.field("createDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("flowTestMapId").caption("Flow Test Map Id")
        		.field("qaFlow").caption("Flow")
        		.field("qaTestResult").caption("Qa Test Result")
        		.field("mappingDescription").caption("Mapping Description")
        		.field("createDt").caption("Created Date")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Flow Test Map Id","flowTestMapId")
        		.filter("Flow","qaFlow")
        		.filter("Qa Test Result","qaTestResult")
        		.filter("Mapping Description","mappingDescription")
        		.build();
    }
}
