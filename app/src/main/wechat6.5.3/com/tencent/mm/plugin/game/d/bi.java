package com.tencent.mm.plugin.game.d;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class bi extends a {
    public boolean gkI;
    public LinkedList<String> gkJ = new LinkedList();
    public d gkt;
    public String gkx;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gkt == null) {
                throw new b("Not all required fields were included: AppItem");
            }
            if (this.gkt != null) {
                aVar.dX(1, this.gkt.aHr());
                this.gkt.a(aVar);
            }
            if (this.gkx != null) {
                aVar.e(2, this.gkx);
            }
            aVar.ab(3, this.gkI);
            aVar.d(4, 1, this.gkJ);
            return 0;
        } else if (i == 1) {
            if (this.gkt != null) {
                r0 = a.a.a.a.dU(1, this.gkt.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.gkx != null) {
                r0 += a.a.a.b.b.a.f(2, this.gkx);
            }
            return (r0 + (a.a.a.b.b.a.cw(3) + 1)) + a.a.a.a.c(4, 1, this.gkJ);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.gkJ.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.gkt != null) {
                return 0;
            }
            throw new b("Not all required fields were included: AppItem");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bi biVar = (bi) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        d dVar = new d();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = dVar.a(aVar4, dVar, a.a(aVar4))) {
                        }
                        biVar.gkt = dVar;
                    }
                    return 0;
                case 2:
                    biVar.gkx = aVar3.pMj.readString();
                    return 0;
                case 3:
                    biVar.gkI = aVar3.bQJ();
                    return 0;
                case 4:
                    biVar.gkJ.add(aVar3.pMj.readString());
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
