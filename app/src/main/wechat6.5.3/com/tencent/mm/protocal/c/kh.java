package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class kh extends aqp {
    public String aZy;
    public String fileid;
    public String mmR;
    public int mmS;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.fileid == null) {
                throw new b("Not all required fields were included: fileid");
            } else if (this.aZy == null) {
                throw new b("Not all required fields were included: md5");
            } else {
                if (this.mPU != null) {
                    aVar.dX(1, this.mPU.aHr());
                    this.mPU.a(aVar);
                }
                if (this.fileid != null) {
                    aVar.e(2, this.fileid);
                }
                if (this.aZy != null) {
                    aVar.e(3, this.aZy);
                }
                if (this.mmR != null) {
                    aVar.e(4, this.mmR);
                }
                aVar.dV(5, this.mmS);
                return 0;
            }
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.fileid != null) {
                r0 += a.a.a.b.b.a.f(2, this.fileid);
            }
            if (this.aZy != null) {
                r0 += a.a.a.b.b.a.f(3, this.aZy);
            }
            if (this.mmR != null) {
                r0 += a.a.a.b.b.a.f(4, this.mmR);
            }
            return r0 + a.a.a.a.dS(5, this.mmS);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.fileid == null) {
                throw new b("Not all required fields were included: fileid");
            } else if (this.aZy != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: md5");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            kh khVar = (kh) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        khVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    khVar.fileid = aVar3.pMj.readString();
                    return 0;
                case 3:
                    khVar.aZy = aVar3.pMj.readString();
                    return 0;
                case 4:
                    khVar.mmR = aVar3.pMj.readString();
                    return 0;
                case 5:
                    khVar.mmS = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
