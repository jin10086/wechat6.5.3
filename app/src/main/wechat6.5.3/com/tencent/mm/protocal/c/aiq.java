package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class aiq extends a {
    public int eeO;
    public arf mbC;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mbC == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            }
            if (this.mbC != null) {
                aVar.dX(1, this.mbC.aHr());
                this.mbC.a(aVar);
            }
            aVar.dV(2, this.eeO);
            return 0;
        } else if (i == 1) {
            if (this.mbC != null) {
                r0 = a.a.a.a.dU(1, this.mbC.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.dS(2, this.eeO);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mbC != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ChatRoomName");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            aiq com_tencent_mm_protocal_c_aiq = (aiq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        a com_tencent_mm_protocal_c_arf = new arf();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = com_tencent_mm_protocal_c_arf.a(aVar4, com_tencent_mm_protocal_c_arf, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aiq.mbC = com_tencent_mm_protocal_c_arf;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aiq.eeO = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
