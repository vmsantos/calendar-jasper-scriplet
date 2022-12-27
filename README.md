# calendar-jasper-scriplet

## Instruções para usar o scriptlet de calendário no JasperReports:

1. No iReport, vá para o painel "Inspector de Relatórios" e clique no nó "Scriptlets".
2. Clique no botão "Adicionar Scriptlet" e digite "CalendarScriptlet" como o nome e "CalendarScriptlet" como a classe.
3. Adicione três parâmetros ao relatório com os nomes "ano", "mês" e "diaDoMês". Esses parâmetros serão usados ​​para definir a data para o calendário.
4. No layout do relatório, adicione um campo de texto e use a expressão "CalendarScriptlet.monthYear" como o valor do campo de texto. Isso exibirá o mês e o ano do calendário.
5. Adicione outro campo de texto e use a expressão "CalendarScriptlet.weekday" como o valor do campo de texto. Isso exibirá o dia da semana para a data selecionada.
6. Em seguida, basta passar os valores para os parâmetros "ano", "mês" e "diaDoMês" para o relatório quando ele for executado, e o calendário será gerado com base na data especificada.
