<tr>
    <td><input value="${(billingCycle.name)!""}" type="text"></td>
    <td><input value="${(((billingCycle.serviceRate)!0)/10)?string("0.0")}" type="text"></td>
    <td><input value="${(billingCycle.description)!""}" type="text"></td>
    <td><a value="${(billingCycle.id)!""}" class="a_btn saveBillingCycle">确定</a>
    <a href="javascript:void(0)" class="a_btn canceltr">取消</a>
    </td>
</tr>