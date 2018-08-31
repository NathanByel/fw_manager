package com.company;

import javax.swing.*;

public class Localisator {
    public static void setLocalisation() {
        // Локализация компонентов окна JFileChooser
        UIManager.put("FileChooser.saveButtonText", "Сохранить");
        UIManager.put("FileChooser.directoryOpenButtonText", "Открыть");
        UIManager.put("FileChooser.openButtonText", "Открыть");
        UIManager.put("FileChooser.cancelButtonText", "Отмена");
        UIManager.put("FileChooser.fileNameLabelText", "Наименование файла");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Типы файлов");
        UIManager.put("FileChooser.lookInLabelText", "Директория");
        UIManager.put("FileChooser.saveInLabelText", "Сохранить в директории");
        UIManager.put("FileChooser.folderNameLabelText", "Путь директории");
        //UIManager.setLookAndFeel();

                /*public class SwingI18N {

                    private static String bname = "i18n";

                    public static void internationalize(Locale locale) {
                        ResourceBundle b = ResourceBundle.getBundle(bname, locale);
                        for (String s : b.keySet()) {
                            UIManager.put(s, b.getString(s));
                        }
                    }
                }

                FileChooser.acceptAllFileFilterText=Все файлы
                FileChooser.cancelButtonText=Отмена
                FileChooser.cancelButtonToolTipText=Отмена
                FileChooser.deleteFileButtonText=Удалить
                FileChooser.deleteFileButtonToolTipText=Удалить файл
                FileChooser.detailsViewButtonAccessibleName=Подробно
                FileChooser.detailsViewButtonToolTipText=Подробно
                FileChooser.directoryDescriptionText=Папка
                FileChooser.directoryOpenButtonText=Открыть
                FileChooser.directoryOpenButtonToolTipText=Открыть
                FileChooser.enterFilenameLabelText=Имя
                FileChooser.fileDescriptionText=Описание
                FileChooser.fileNameLabelText=Имя файла
                FileChooser.filesLabelText=Файлы
                FileChooser.filesOfTypeLabelText=Типы файлов
                FileChooser.filterLabelText=Тип(ы) файла
                FileChooser.foldersLabelText=Папка
                FileChooser.helpButtonText=Помощь
                FileChooser.helpButtonToolTipText=Помощь
                FileChooser.homeFolderAccessibleName=Дом
                FileChooser.homeFolderToolTipText=Дом
                FileChooser.listViewButtonAccessibleName=Список
                FileChooser.listViewButtonToolTipText=Список
                FileChooser.lookInLabelText=Католог:
                FileChooser.newFolderAccessibleName=Создать папку
                FileChooser.newFolderButtonText=Создать папку
                FileChooser.newFolderButtonToolTipText=Создать папку
                FileChooser.newFolderDialogText=Создать папку
                FileChooser.newFolderErrorSeparator=Ошибка создания
                FileChooser.newFolderErrorText=Ошибка создания
                FileChooser.newFolderToolTipText=Создать папку
                FileChooser.openButtonText=Открыть
                FileChooser.openButtonToolTipText=Открыть
                FileChooser.openDialogTitleText=Открыть
                FileChooser.other.newFolder=Создать папку
                FileChooser.other.newFolder.subsequent=Создать папку
                FileChooser.win32.newFolder=Создать папку
                FileChooser.win32.newFolder.subsequent=Создать папку
                FileChooser.pathLabelText=Путь
                FileChooser.renameFileButtonText=Переименовать
                FileChooser.renameFileButtonToolTipText=Переименовать
                FileChooser.renameFileDialogText=Переименовать
                FileChooser.renameFileErrorText=Ошибка переименования
                FileChooser.renameFileErrorTitle=Ошибка переименования
                FileChooser.saveButtonText=Сохранить
                FileChooser.saveButtonToolTipText=Сохранить
                FileChooser.saveDialogTitleText=Сохранить
                FileChooser.saveInLabelText=Католог:
                FileChooser.updateButtonText=Обновить
                FileChooser.updateButtonToolTipText=Обновить
                FileChooser.upFolderAccessibleName=Вверх
                FileChooser.upFolderToolTipText=Вверх*/
    }
}
