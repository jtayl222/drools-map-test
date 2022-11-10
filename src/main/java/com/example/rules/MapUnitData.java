package com.example.rules;
import com.example.datamodel.A;
import com.example.datamodel.B;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.SingletonStore;
import org.kie.kogito.rules.RuleUnitData;

@lombok.Getter
@lombok.Setter
public class MapUnitData implements RuleUnitData {
    public SingletonStore<A> a = DataSource.createSingleton();
    public SingletonStore<B> b = DataSource.createSingleton();
}
