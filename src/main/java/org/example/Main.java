package org.example;

import com.oracle.truffle.api.nodes.Node;
import org.graalvm.polyglot.Context;

public class Main {
    public static void main(String[] args) {
        Context context; // <- good
        Node node; // <- Package 'com.oracle.truffle.api' is declared in module 'org.graalvm.truffle', \
                   // but module 'untitled.main' does not read it
        System.out.println("Hello world!");
    }
}
