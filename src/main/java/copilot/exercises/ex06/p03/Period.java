package copilot.exercises.ex06.p03;

import java.time.LocalDate;

public class Period {

    //期間（Period）クラスを以下の要件を満たすように作成してください
//   - 開始日と終了日をフィールドで持ちます
//   - 自分自身が持つ期間と引数で受け取った期間が重なっているかどうかを判定するメソッドisOverlapped()を持ちます
//   - このメソッドは、Period型の引数を受け取り、自分自身と引数の期間が重なっていればtrueを、そうでなければfalseを返します
//   - 期間は開始日と終了日を持ちます
//   - 開始日と終了日は、それぞれLocalDate型で持ちます
//   - 期間が重なっているとは、自分自身の開始日が引数の終了日よりも前で、自分自身の終了日が引数の開始日よりも後であることを指します
//   - 期間が重なっている場合は、以下のようになります
//   - 期間1: 2020-01-01 〜 2020-01-31
//   - 期間2: 2020-01-15 〜 2020-02-15
//   - 期間1と期間2は重なっています
//   - 期間1: 2020-01-01 〜 2020-01-31
//   - 期間2: 2020-02-01 〜 2020-02-15
//   - 期間1と期間2は重なっていません
//   - 期間1: 2020-01-01 〜 2020-01-31
//   - 期間2: 2020-01-01 〜 2020-01-31

    private LocalDate startDate;
    private LocalDate endDate;

    public Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isOverlapped(Period period) {
        return this.startDate.isBefore(period.endDate) && this.endDate.isAfter(period.startDate);
    }
}
