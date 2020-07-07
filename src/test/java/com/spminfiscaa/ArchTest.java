package com.spminfiscaa;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.spminfiscaa");

        noClasses()
            .that()
                .resideInAnyPackage("com.spminfiscaa.service..")
            .or()
                .resideInAnyPackage("com.spminfiscaa.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.spminfiscaa.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
