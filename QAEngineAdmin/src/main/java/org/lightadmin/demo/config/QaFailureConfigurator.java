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
import org.lightadmin.api.config.utils.FieldValueRenderer;
import org.lightadmin.demo.model.QaFailure;

public class QaFailureConfigurator extends AdministrationConfiguration<QaFailure>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaFailure")
                .pluralName("QaFailure").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("QA Failure Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("threadId").caption("Thread Id")
        		.renderable(errorLogRenderer()).caption("Error Log")
        		.field("screenshot").caption("Screenshot")
        		.field("createdDt").caption("Date")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("threadId").caption("Thread Id")
        		.field("errorLog").caption("Error Log")
        		.field("screenshot").caption("Screenshot")
        		.field("createdDt").caption("Date")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("threadId").caption("Thread Id")
        		.field("errorLog").caption("Error Log")
        		.field("screenshot").caption("Screenshot")
        		.field("createdDt").caption("Date")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("threadId").caption("Thread Id")
        		.field("errorLog").caption("Error Log")
        		.field("screenshot").caption("Screenshot")
        		.field("createdDt").caption("Date")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Thread Id","threadId")
        		.build();
    }
    
    public static FieldValueRenderer<QaFailure> errorLogRenderer() {
        return new FieldValueRenderer<QaFailure>() {
            @Override
            public String apply( final QaFailure qaFailure ) {
                return qaFailure.getErrorLog().substring(0,100) ;
            }
        };
    }
}
