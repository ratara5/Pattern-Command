package com.raymond;

import com.raymond.commands.Cuenta;
import com.raymond.commands.DepositarImpl;
import com.raymond.commands.Invoker;
import com.raymond.commands.RetirarImpl;

public class App {

    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta(1, 2000000000);

        DepositarImpl opDepositar=new DepositarImpl(cuenta,100000000);
        RetirarImpl opRetirar=new RetirarImpl(cuenta,20000000);

        Invoker ivk=new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);

        ivk.realizarOperaciones();
    }
}
