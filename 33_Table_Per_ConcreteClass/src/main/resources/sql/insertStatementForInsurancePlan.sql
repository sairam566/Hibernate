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
PK Value: 1
InsurancePlan [insurancePlanNo=1, planName=Med+, description=Insurance_Plan, taxSaver=true, minInsurredAmount=5000000.0]
Hibernate: 
    insert 
    into
        insurance_plan
        (description, plan_name, tax_save, min_insurred_amount, insurance_Plan_No) 
    values
        (?, ?, ?, ?, ?)