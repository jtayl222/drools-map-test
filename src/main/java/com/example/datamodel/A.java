package com.example.datamodel;

import java.util.List;
import java.util.Map;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.ToString
public class A {
        Map<String, List<String>> a1;
        List<A2>  a2;
        List<A3> a3;
}
