package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class jo extends a {
    public int eOX;
    public LinkedList<jp> mlV = new LinkedList();
    public int mlW;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.eOX);
            aVar.d(2, 8, this.mlV);
            aVar.dV(3, this.mlW);
            return 0;
        } else if (i == 1) {
            return ((a.a.a.a.dS(1, this.eOX) + 0) + a.a.a.a.c(2, 8, this.mlV)) + a.a.a.a.dS(3, this.mlW);
        } else {
            byte[] bArr;
            if (i == 2) {
                bArr = (byte[]) objArr[0];
                this.mlV.clear();
                a.a.a.a.a aVar2 = new a.a.a.a.a(bArr, unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
                jo joVar = (jo) objArr[1];
                int intValue = ((Integer) objArr[2]).intValue();
                switch (intValue) {
                    case 1:
                        joVar.eOX = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        LinkedList zQ = aVar3.zQ(intValue);
                        int size = zQ.size();
                        for (intValue = 0; intValue < size; intValue++) {
                            bArr = (byte[]) zQ.get(intValue);
                            a jpVar = new jp();
                            a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                            for (boolean z = true; z; z = jpVar.a(aVar4, jpVar, a.a(aVar4))) {
                            }
                            joVar.mlV.add(jpVar);
                        }
                        return 0;
                    case 3:
                        joVar.mlW = aVar3.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
