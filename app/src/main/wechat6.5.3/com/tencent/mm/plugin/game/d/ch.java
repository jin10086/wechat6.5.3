package com.tencent.mm.plugin.game.d;

import a.a.a.b;
import com.tencent.mm.ba.a;

public final class ch extends a {
    public String gon;
    public String goo;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gon == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.goo == null) {
                throw new b("Not all required fields were included: TimeDesc");
            } else {
                if (this.gon != null) {
                    aVar.e(1, this.gon);
                }
                if (this.goo == null) {
                    return 0;
                }
                aVar.e(2, this.goo);
                return 0;
            }
        } else if (i == 1) {
            if (this.gon != null) {
                r0 = a.a.a.b.b.a.f(1, this.gon) + 0;
            } else {
                r0 = 0;
            }
            if (this.goo != null) {
                r0 += a.a.a.b.b.a.f(2, this.goo);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.gon == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.goo != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: TimeDesc");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ch chVar = (ch) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    chVar.gon = aVar3.pMj.readString();
                    return 0;
                case 2:
                    chVar.goo = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
