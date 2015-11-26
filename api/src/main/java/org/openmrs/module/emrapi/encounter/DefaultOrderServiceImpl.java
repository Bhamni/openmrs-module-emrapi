/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.emrapi.encounter;

import org.openmrs.Encounter;
import org.openmrs.annotation.OpenmrsProfile;
import org.openmrs.module.emrapi.encounter.domain.EncounterTransaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "emrOrderService")
@OpenmrsProfile(openmrsVersion = "1.9.*")
public class DefaultOrderServiceImpl implements EmrOrderService{

    @Override
    public void save(List<EncounterTransaction.DrugOrder> drugOrders, Encounter encounter) {
    }

    @Override
    public void saveOrders(List<EncounterTransaction.Order> orders, Encounter encounter) {
    }

/*    @Override
    public void saveOrderGroups(List<EncounterTransaction.OrderGroup> orderGroups, Encounter encounter) {
    }*/
}
