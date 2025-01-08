# Generated by Django 5.1.3 on 2024-12-11 23:14

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('my_first_app', '0002_car_year'),
    ]

    operations = [
        migrations.CreateModel(
            name='Publisher',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.TextField(max_length=200)),
                ('address', models.TextField(max_length=200)),
            ],
        ),
        migrations.CreateModel(
            name='Book',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.TimeField(max_length=200)),
                ('publication_date', models.DateField()),
                ('Publisher', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='my_first_app.publisher')),
            ],
        ),
    ]