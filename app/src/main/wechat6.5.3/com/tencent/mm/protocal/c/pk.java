package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class pk extends aqx {
    public pn mrj;
    public ph mrk;
    public pi mrl;
    public String mrm;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            if (this.mrj != null) {
                aVar.dX(2, this.mrj.aHr());
                this.mrj.a(aVar);
            }
            if (this.mrk != null) {
                aVar.dX(3, this.mrk.aHr());
                this.mrk.a(aVar);
            }
            if (this.mrl != null) {
                aVar.dX(4, this.mrl.aHr());
                this.mrl.a(aVar);
            }
            if (this.mrm == null) {
                return 0;
            }
            aVar.e(5, this.mrm);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mrj != null) {
                r0 += a.a.a.a.dU(2, this.mrj.aHr());
            }
            if (this.mrk != null) {
                r0 += a.a.a.a.dU(3, this.mrk.aHr());
            }
            if (this.mrl != null) {
                r0 += a.a.a.a.dU(4, this.mrl.aHr());
            }
            if (this.mrm != null) {
                r0 += a.a.a.b.b.a.f(5, this.mrm);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            pk pkVar = (pk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        pkVar.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        pn pnVar = new pn();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = pnVar.a(aVar4, pnVar, aqx.a(aVar4))) {
                        }
                        pkVar.mrj = pnVar;
                    }
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        ph phVar = new ph();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = phVar.a(aVar4, phVar, aqx.a(aVar4))) {
                        }
                        pkVar.mrk = phVar;
                    }
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        pi piVar = new pi();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = piVar.a(aVar4, piVar, aqx.a(aVar4))) {
                        }
                        pkVar.mrl = piVar;
                    }
                    return 0;
                case 5:
                    pkVar.mrm = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
