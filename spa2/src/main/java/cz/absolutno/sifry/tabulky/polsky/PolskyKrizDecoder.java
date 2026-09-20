package cz.absolutno.sifry.tabulky.polsky;

import cz.absolutno.sifry.common.decoder.AlphabetDecoder;


final class PolskyKrizDecoder extends AlphabetDecoder {
    public PolskyKrizDecoder() {
        super(27, "");
    }

    public PolskyKrizDecoder(String var) {
        super(27, stripSize(var));
    }

    public void setVar(String var) {
        setVar(27, stripSize(var));
    }

    private static String stripSize(String var) {
        int i = var.indexOf(':');
        return i >= 0 ? var.substring(0, i) : var;
    }

    public String decode(int[] a) {
        return decode(a[0] * 9 + a[1] * 3 + a[2]);
    }

}
