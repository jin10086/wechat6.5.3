package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class aog extends a {
    public int eet;
    public int mAf;
    public LinkedList<aof> mOv = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.mAf);
            aVar.dV(2, this.eet);
            aVar.d(3, 8, this.mOv);
            return 0;
        } else if (i == 1) {
            return ((a.a.a.a.dS(1, this.mAf) + 0) + a.a.a.a.dS(2, this.eet)) + a.a.a.a.c(3, 8, this.mOv);
        } else {
            byte[] bArr;
            if (i == 2) {
                bArr = (byte[]) objArr[0];
                this.mOv.clear();
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
                aog com_tencent_mm_protocal_c_aog = (aog) objArr[1];
                int intValue = ((Integer) objArr[2]).intValue();
                switch (intValue) {
                    case 1:
                        com_tencent_mm_protocal_c_aog.mAf = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        com_tencent_mm_protocal_c_aog.eet = aVar3.pMj.mH();
                        return 0;
                    case 3:
                        LinkedList zQ = aVar3.zQ(intValue);
                        int size = zQ.size();
                        for (intValue = 0; intValue < size; intValue++) {
                            bArr = (byte[]) zQ.get(intValue);
                            a com_tencent_mm_protocal_c_aof = new aof();
                            a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                            for (boolean z = true; z; z = com_tencent_mm_protocal_c_aof.a(aVar4, com_tencent_mm_protocal_c_aof, a.a(aVar4))) {
                            }
                            com_tencent_mm_protocal_c_aog.mOv.add(com_tencent_mm_protocal_c_aof);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
