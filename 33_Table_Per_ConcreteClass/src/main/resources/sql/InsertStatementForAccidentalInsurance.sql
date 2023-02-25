Hibernate: 
    select
        max(ids_.mx) 
    from
        ( select
            max(insurance_Plan_No) as mx 
        from
            accidental_insurance_plan 
        union
        select
            max(insurance_Plan_No) as mx 
        from
            medical_insurance_plan 
        union
        select
            max(insurance_Plan_No) as mx 
        from
            insurance_plan 
    ) ids_
PK Value: 3
AccidentalInsurancePlan [coverageType=Covered, disabilityCoveragePercentage=50.0, insurancePlanNo=3, planName=Med+, description=Accidental_Insurance_Plan, taxSaver=true, minInsurredAmount=5000000.0]
Hibernate: 
    insert 
    into
        accidental_insurance_plan
        (description, plan_name, tax_save, min_insurred_amount, coverage_type, disability_coverage_percentage, insurance_Plan_No) 
    values
        (?, ?, ?, ?, ?, ?, ?)