package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class iy extends aqp {
    public float bhs;
    public float biH;
    public String bol;
    public String eBK;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.eBK != null) {
                aVar.e(2, this.eBK);
            }
            aVar.j(3, this.biH);
            aVar.j(4, this.bhs);
            if (this.bol == null) {
                return 0;
            }
            aVar.e(5, this.bol);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.eBK != null) {
                r0 += a.a.a.b.b.a.f(2, this.eBK);
            }
            r0 = (r0 + (a.a.a.b.b.a.cw(3) + 4)) + (a.a.a.b.b.a.cw(4) + 4);
            if (this.bol != null) {
                r0 += a.a.a.b.b.a.f(5, this.bol);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            iy iyVar = (iy) objArr[1];
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
                        iyVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    iyVar.eBK = aVar3.pMj.readString();
                    return 0;
                case 3:
                    iyVar.biH = aVar3.pMj.readFloat();
                    return 0;
                case 4:
                    iyVar.bhs = aVar3.pMj.readFloat();
                    return 0;
                case 5:
                    iyVar.bol = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
