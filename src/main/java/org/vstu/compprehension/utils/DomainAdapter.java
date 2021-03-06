package org.vstu.compprehension.utils;

import org.vstu.compprehension.models.businesslogic.domains.Domain;
import org.vstu.compprehension.models.businesslogic.domains.ProgrammingLanguageExpressionDomain;

import java.util.HashMap;

public class DomainAdapter {
    private static HashMap<String, Domain> domains ;
    static {
        domains = new HashMap<>();
        domains.put("ProgrammingLanguageExpressionDomain", new ProgrammingLanguageExpressionDomain());
    }

    public static Domain getDomain(String name){
        return domains.get(name);
    }
}
